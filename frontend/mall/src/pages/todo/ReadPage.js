import React from 'react';
import ReadComponent from "../../components/todo/ReadComponent";
import {useParams} from "react-router-dom";

function ReadPage(props) {

    const {tno} = useParams()

    return (
        <div className="font-extrabold w-full bg-white mt-6">
            <div className="text-2xl">
                Todo Read Page Component {tno}
            </div>

            <ReadComponent tno={tno}/>
        </div>
    );
}

export default ReadPage;